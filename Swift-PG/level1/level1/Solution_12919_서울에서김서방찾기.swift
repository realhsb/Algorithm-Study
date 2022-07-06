//
//  main.swift
//  level1
//
//  Created by 한수빈 on 2022/07/05.
//

import Foundation

func solution(_ seoul:[String]) -> String {
    for i in 0..<seoul.count {
        if(seoul[i] == "Kim"){
            return "김서방은 \(i)에 있다"
        }
    }
    return " "
}
