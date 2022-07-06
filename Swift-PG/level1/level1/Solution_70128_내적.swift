//
//  Solution_70128_내적.swift
//  level1
//
//  Created by 한수빈 on 2022/07/06.
//

import Foundation

func solution(_ a:[Int], _ b:[Int]) -> Int {
    var sum = 0
    for i in 0...a.count-1 {
        sum += a[i] * b[i]
    }
    
    return sum
}
