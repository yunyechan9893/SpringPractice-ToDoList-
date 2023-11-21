package com.example.springtodolist.database

import java.time.LocalDateTime

data class Todo(
        var index:Int? =null,                // 일정 index
        var title:String? = null,            // 일정 타이틀
        var description:String? = null,      // 일정 설명
        var schadule:LocalDateTime? = null,  // 일정 스케줄
        var createAt: LocalDateTime? = null, // 생성 시간
        var updateAt: LocalDateTime? = null  // 업데이트 시간
)