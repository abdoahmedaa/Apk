package com.focusflow.app

import com.focusflow.app.data.database.dao.TaskDao
import com.focusflow.app.data.database.entities.TaskEntity
import com.focusflow.app.data.database.entities.Priority
import com.focusflow.app.data.repository.TaskRepository
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.whenever
import java.util.Date

class TaskRepositoryTest {
    
    @Mock
    private lateinit var taskDao: TaskDao
    
    private lateinit var taskRepository: TaskRepository
    
    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        taskRepository = TaskRepository(taskDao)
    }
    
    @Test
    fun `getAllTasks returns mapped domain models`() = runTest {
        // Given
        val taskEntities = listOf(
            TaskEntity(
                id = 1,
                title = "Test Task 1",
                description = "Description 1",
                priority = Priority.HIGH,
                isCompleted = false
            ),
            TaskEntity(
                id = 2,
                title = "Test Task 2",
                description = "Description 2",
                priority = Priority.LOW,
                isCompleted = true
            )
        )
        
        whenever(taskDao.getAllTasks()).thenReturn(flowOf(taskEntities))
        
        // When
        val result = taskRepository.getAllTasks().first()
        
        // Then
        assertEquals(2, result.size)
        assertEquals("Test Task 1", result[0].title)
        assertEquals("Test Task 2", result[1].title)
        assertEquals(Priority.HIGH, result[0].priority)
        assertEquals(Priority.LOW, result[1].priority)
        assertFalse(result[0].isCompleted)
        assertTrue(result[1].isCompleted)
    }
    
    @Test
    fun `getActiveTasks returns only incomplete tasks`() = runTest {
        // Given
        val activeTaskEntities = listOf(
            TaskEntity(
                id = 1,
                title = "Active Task",
                description = "Active Description",
                priority = Priority.MEDIUM,
                isCompleted = false
            )
        )
        
        whenever(taskDao.getActiveTasks()).thenReturn(flowOf(activeTaskEntities))
        
        // When
        val result = taskRepository.getActiveTasks().first()
        
        // Then
        assertEquals(1, result.size)
        assertEquals("Active Task", result[0].title)
        assertFalse(result[0].isCompleted)
    }
    
    @Test
    fun `getCompletedTasks returns only completed tasks`() = runTest {
        // Given
        val completedTaskEntities = listOf(
            TaskEntity(
                id = 1,
                title = "Completed Task",
                description = "Completed Description",
                priority = Priority.URGENT,
                isCompleted = true
            )
        )
        
        whenever(taskDao.getCompletedTasks()).thenReturn(flowOf(completedTaskEntities))
        
        // When
        val result = taskRepository.getCompletedTasks().first()
        
        // Then
        assertEquals(1, result.size)
        assertEquals("Completed Task", result[0].title)
        assertTrue(result[0].isCompleted)
    }
}
