import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {AppRoutingModule} from './app-routing.module';
import {CommonModule} from '@angular/common';

@NgModule({
  declarations: [
  AppComponent,
  UserListComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    RouterModule,
    HttpClientModule,
    CommonModule



 ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
