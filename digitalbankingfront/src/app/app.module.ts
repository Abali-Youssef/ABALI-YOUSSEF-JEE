import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CustomersComponent } from './components/customers/customers.component';
import { AccountsComponent } from './components/accounts/accounts.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
const routes:Routes=[
  {path :"customers",component : CustomersComponent},
    {path:"accounts",component:AccountsComponent},
];

@NgModule({
 
  
  declarations: [
    AppComponent,
    NavbarComponent,
    CustomersComponent,
    AccountsComponent
  ],
  imports: [
    
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  exports:[RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
