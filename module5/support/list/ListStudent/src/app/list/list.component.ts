import { Component, OnInit } from '@angular/core';
export interface IStudent {
  id: number;
  name: string;
  age: number;
  img: string;
}
@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})

export class ListComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name: 'Đỗ Huỳnh Ngọc Thế',
    age: 21,
    img: 'https://ict-imgs.vgcloud.vn/2020/09/01/19/huong-dan-tao-facebook-avatar.jpg'
  };
  constructor() { }

  ngOnInit(): void {
  }

}
