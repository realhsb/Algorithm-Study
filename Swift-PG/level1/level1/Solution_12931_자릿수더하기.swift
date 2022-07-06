//
//  Solution_12931_자릿수더하기.swift
//  level1
//
//  Created by 한수빈 on 2022/07/06.
//

import Foundation

func solution(_ n:Int) -> Int
{
    var answer:Int = 0
    var num = n

    while(num > 0){
        answer += (num % 10)
        num /= 10
    }
    
    return answer
}
