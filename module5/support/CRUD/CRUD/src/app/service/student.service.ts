import { Injectable } from '@angular/core';
import {Student} from "../model/Student";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  private StudentList: Student[] = [new Student(1, "The", 21),
                                    new Student(2, "Hai", 25),
                                    new Student(3, "viet", 25),
                                    new Student(4, "Nam", 21),
                                    new Student(5, "Phat", 25),
                                    new Student(6, "Linh", 25),
                                    new Student(7, "Ha", 24),
                                    new Student(8, "Hien", 25),
                                    new Student(9, "Quang", 25),
                                    new Student(10, "Thien", 21)];
  getList(): Student[] {
    return this.StudentList;
  }
}
