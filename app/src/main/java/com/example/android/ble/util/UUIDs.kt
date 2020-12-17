package com.example.android.ble.util

import java.util.*

/**
 * Created by 4z7l(7d4z7l@gmail.com) on 2020-12-15.
 *
 * Contents : ble 기기의 UUID 목록
 */

object UUIDs {
    val BASIC_SERVICE: UUID = UUID.fromString("0000fee0-0000-1000-8000-00805f9b34fb")
    val BASIC_BATTERY_CHARACTERISTIC: UUID = UUID.fromString("00000006-0000-3512-2118-0009af100700")
    val BASIC_STEP_CHARACTERISTIC: UUID = UUID.fromString("00000007-0000-3512-2118-0009af100700")

    val ALERT_NOTIFICATION_SERVICE: UUID = UUID.fromString("00001802-0000-1000-8000-00805f9b34fb")
    val ALERT_NOTIFICATION_CHARACTERISTIC: UUID = UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb")

    val HEART_RATE_SERVICE: UUID = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb")
    val HEART_RATE_MEASUREMENT_CHARACTERISTIC: UUID = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb")
    val HEART_RATE_DESCRIPTOR: UUID = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb")
    val HEART_RATE_CONTROL_CHARACTERISTIC: UUID = UUID.fromString("00002a39-0000-1000-8000-00805f9b34fb")
}