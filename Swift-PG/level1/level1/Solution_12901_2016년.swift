//
//  main.swift
//  level1
//
//  Created by 한수빈 on 2022/07/05.
//

import Foundation

func solution(_ a:Int, _ b:Int) -> String {
    let months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    var days : Int = 0
    for i in 0...a {
        if(i == a-1){
            days += b
            break
        }
        days += months[i]
    }
   // print(days)
    days %= 7
    switch days {
        case 1 :
            return "FRI"
        case 2 :
            return "SAT"
        case 3 :
            return "SUN"
        case 4 :
            return "MON"
        case 5 :
            return "TUE"
        case 6 :
            return "WED"
        case 0 :
            return "THU"
        default :
            return " "
    }
    return " "
}
