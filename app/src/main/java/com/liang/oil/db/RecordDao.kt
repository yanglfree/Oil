package com.liang.oil.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.liang.oil.data.OilRecord
import kotlinx.coroutines.flow.Flow

@Dao
interface RecordDao {
    @Query("SELECT * FROM oilrecord ORDER BY addTime ASC")
    fun getAll(): Flow<List<OilRecord>>

    @Insert(onConflict = OnConflictStrategy.IGNORE )
    suspend fun insertRecord(record: OilRecord)

    @Update
    suspend fun update(record: OilRecord)

    @Delete
    suspend fun delete(record: OilRecord)
}