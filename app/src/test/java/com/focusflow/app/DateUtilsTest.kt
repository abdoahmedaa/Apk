package com.focusflow.app

import com.focusflow.app.utils.DateUtils
import org.junit.Test
import org.junit.Assert.*
import java.util.*

class DateUtilsTest {
    
    @Test
    fun `formatDate returns correct format`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 25, 10, 30, 0)
            set(Calendar.MILLISECOND, 0)
        }
        val date = calendar.time
        
        // When
        val result = DateUtils.formatDate(date, "yyyy-MM-dd")
        
        // Then
        assertEquals("2023-12-25", result)
    }
    
    @Test
    fun `formatTime returns correct format`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 25, 14, 30, 0)
            set(Calendar.MILLISECOND, 0)
        }
        val date = calendar.time
        
        // When
        val result = DateUtils.formatTime(date, "HH:mm")
        
        // Then
        assertEquals("14:30", result)
    }
    
    @Test
    fun `isToday returns true for today's date`() {
        // Given
        val today = Date()
        
        // When
        val result = DateUtils.isToday(today)
        
        // Then
        assertTrue(result)
    }
    
    @Test
    fun `isToday returns false for yesterday's date`() {
        // Given
        val yesterday = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, -1)
        }.time
        
        // When
        val result = DateUtils.isToday(yesterday)
        
        // Then
        assertFalse(result)
    }
    
    @Test
    fun `isTomorrow returns true for tomorrow's date`() {
        // Given
        val tomorrow = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, 1)
        }.time
        
        // When
        val result = DateUtils.isTomorrow(tomorrow)
        
        // Then
        assertTrue(result)
    }
    
    @Test
    fun `isYesterday returns true for yesterday's date`() {
        // Given
        val yesterday = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, -1)
        }.time
        
        // When
        val result = DateUtils.isYesterday(yesterday)
        
        // Then
        assertTrue(result)
    }
    
    @Test
    fun `isOverdue returns true for past date`() {
        // Given
        val pastDate = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, -1)
        }.time
        
        // When
        val result = DateUtils.isOverdue(pastDate)
        
        // Then
        assertTrue(result)
    }
    
    @Test
    fun `isOverdue returns false for future date`() {
        // Given
        val futureDate = Calendar.getInstance().apply {
            add(Calendar.DAY_OF_YEAR, 1)
        }.time
        
        // When
        val result = DateUtils.isOverdue(futureDate)
        
        // Then
        assertFalse(result)
    }
    
    @Test
    fun `addDays returns correct date`() {
        // Given
        val baseDate = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 25, 0, 0, 0)
            set(Calendar.MILLISECOND, 0)
        }.time
        
        // When
        val result = DateUtils.addDays(baseDate, 5)
        
        // Then
        val expectedDate = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 30, 0, 0, 0)
            set(Calendar.MILLISECOND, 0)
        }.time
        
        val resultCalendar = Calendar.getInstance().apply { time = result }
        val expectedCalendar = Calendar.getInstance().apply { time = expectedDate }
        
        assertEquals(expectedCalendar.get(Calendar.YEAR), resultCalendar.get(Calendar.YEAR))
        assertEquals(expectedCalendar.get(Calendar.MONTH), resultCalendar.get(Calendar.MONTH))
        assertEquals(expectedCalendar.get(Calendar.DAY_OF_MONTH), resultCalendar.get(Calendar.DAY_OF_MONTH))
    }
    
    @Test
    fun `getStartOfDay returns midnight`() {
        // Given
        val date = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 25, 14, 30, 45)
            set(Calendar.MILLISECOND, 500)
        }.time
        
        // When
        val result = DateUtils.getStartOfDay(date)
        
        // Then
        val calendar = Calendar.getInstance().apply { time = result }
        assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY))
        assertEquals(0, calendar.get(Calendar.MINUTE))
        assertEquals(0, calendar.get(Calendar.SECOND))
        assertEquals(0, calendar.get(Calendar.MILLISECOND))
    }
    
    @Test
    fun `getEndOfDay returns end of day`() {
        // Given
        val date = Calendar.getInstance().apply {
            set(2023, Calendar.DECEMBER, 25, 14, 30, 45)
            set(Calendar.MILLISECOND, 500)
        }.time
        
        // When
        val result = DateUtils.getEndOfDay(date)
        
        // Then
        val calendar = Calendar.getInstance().apply { time = result }
        assertEquals(23, calendar.get(Calendar.HOUR_OF_DAY))
        assertEquals(59, calendar.get(Calendar.MINUTE))
        assertEquals(59, calendar.get(Calendar.SECOND))
        assertEquals(999, calendar.get(Calendar.MILLISECOND))
    }
}
