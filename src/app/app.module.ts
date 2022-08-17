import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IntropageComponent } from './intro/intropage/intropage.component';
import { AboutpageComponent } from './intro/aboutpage/aboutpage.component';
import { LoginpageComponent } from './intro/loginpage/loginpage.component';
import { DashboardComponent } from './empDashboard/dashboard/dashboard.component';
import { ForgetPasswordComponent } from './intro/forget-password/forget-password.component';
import { NavigationComponent } from './intro/navigation/navigation.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreditComponent } from './credit/credit.component';
import { EmployeesComponent } from './employees/employees.component'
@NgModule({
  declarations: [
    AppComponent,
    IntropageComponent,
    AboutpageComponent,
    LoginpageComponent,
    DashboardComponent,
    ForgetPasswordComponent,
    NavigationComponent,
    CreditComponent,
    EmployeesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
