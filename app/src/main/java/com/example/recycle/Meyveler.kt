package com.example.recycle

import java.io.Serializable

data class Meyveler(var meyve_id:Int,
                    var meyveResim_ad:String,
                    var meyve_fiyat:Double,
                    var meyve_ad:String,
                    var meyve_gram:String ) : Serializable {
}