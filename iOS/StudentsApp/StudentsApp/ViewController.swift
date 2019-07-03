//
//  ViewController.swift
//  StudentsApp
//
//  Created by Valentin Ageev on 18/06/2019.
//  Copyright © 2019 Valentin Ageev. All rights reserved.
//

import UIKit
import Commons

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        let test = TestEntity.Companion().create(text: "text")
        
        print(test.text)
        
        let test2 = test.changeText(text: "text2")
        
        print(test.text, test2.text)
        
        print(TestEntity.Companion(), TestEntity.Companion())
    }
}

