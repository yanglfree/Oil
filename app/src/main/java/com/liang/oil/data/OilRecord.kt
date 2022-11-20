package com.liang.oil.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OilRecord(
    @PrimaryKey val id: Int,
    @ColumnInfo val oilAmount: Float, //此次加油的量
    @ColumnInfo val currentKm: Float, //当前里程
    @ColumnInfo val oilTime: String?, //加油时间
    @ColumnInfo val addTime: String?, //记录时间
    @ColumnInfo val oilStationName: String?
)