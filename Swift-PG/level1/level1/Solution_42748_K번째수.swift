//
//  Solution_42748_K번째수.swift
//  level1
//
//  Created by 한수빈 on 2022/07/06.
//

import Foundation

func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    var answer = [Int]()
    
    for i in 0..<commands.count {
        let subArray : [Int] = Array(array[commands[i][0]-1...commands[i][1]-1]).sorted()
        let index = commands[i][2]
        answer.append(subArray[index-1])
    }
    return answer
}
