//
//  Solution_12935_제일작은수제거하기.swift
//  level1
//
//  Created by 한수빈 on 2022/07/06.
//

import Foundation

func solution(_ arr:[Int]) -> [Int] {
    /*
     arr이 let으로 선언된 배열이라, remove() 함수를 사용하지 못 함
     그러므로 배열을 복사한 후에 사용
     */
    
    var arr_copy = arr
    let min = arr_copy.min() ?? 0
    if let index = arr_copy.firstIndex(of:min){
        arr_copy.remove(at : index)
    }
    
    if(arr_copy.count == 0) {
        return [-1]
    }
    return arr_copy
}
