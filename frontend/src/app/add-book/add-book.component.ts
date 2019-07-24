import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Book} from '../Book';
import {BookstoreService} from '../bookstore.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  book: Book;

  ngOnInit() {
  }
  constructor(private route: ActivatedRoute, private router: Router, private bookstoreService: BookstoreService){
    this.book = new Book();
  }

  onSubmit() {
    this.bookstoreService.save(this.book).subscribe(result => this.gotoUserList());
  }
  gotoUserList() {
    this.router.navigate(['/addBookResult']);
  }
}
