package io.tianb.listdetailnav2

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity
data class Crime(
    @PrimaryKey val id: UUID,
    val date: Date,
    val isSolved: Boolean
)