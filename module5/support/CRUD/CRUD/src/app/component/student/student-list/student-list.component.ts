import { Component, OnInit } from '@angular/core';
import {StudentService} from "../../../service/student.service";
import {Student} from "../../../model/Student";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  StudentList: Student[];

  constructor(private studentService : StudentService) { }

  ngOnInit(): void {
    this.initDataListStudent()
  }
  initDataListStudent() {
    this.StudentList = this.studentService.getList();
    console.log(this.StudentList)
  }
}
