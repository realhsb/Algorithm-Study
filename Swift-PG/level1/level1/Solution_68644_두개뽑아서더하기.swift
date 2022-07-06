//
//  Solution_68644_두개뽑아서더하기.swift
//  level1
//
//  Created by 한수빈 on 2022/07/06.
//

import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var set = Set<Int>()
    for i in 0..<numbers.count {
        for j in i+1..<numbers.count {
            set.insert(numbers[i] + numbers[j])
        }
    }
    var array = Array(set).sorted()
    return array
}
