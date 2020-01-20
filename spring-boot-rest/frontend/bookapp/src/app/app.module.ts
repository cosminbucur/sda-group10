import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BooksService } from './core/books.service';
import { AppComponent } from './app.component';
import { ListBookComponent } from './features/books/list-book/list-book.component';
import { HttpClientModule } from '@angular/common/http';
import { AddBookComponent } from './features/books/add-book/add-book.component';

@NgModule({
  declarations: [
    AppComponent,
    ListBookComponent,
    AddBookComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [BooksService],
  bootstrap: [AppComponent]
})
export class AppModule { }
