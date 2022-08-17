import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreditComponent } from './credit/credit.component';
import { DashboardComponent } from './empDashboard/dashboard/dashboard.component';
import { EmployeesComponent } from './employees/employees.component';
import { AboutpageComponent } from './intro/aboutpage/aboutpage.component';
import { ForgetPasswordComponent } from './intro/forget-password/forget-password.component';
import { IntropageComponent } from './intro/intropage/intropage.component';
import { LoginpageComponent } from './intro/loginpage/loginpage.component';
import { NavigationComponent } from './intro/navigation/navigation.component'

const routes: Routes = [
  {path: '', component: IntropageComponent},
  {path: 'navbar', component: NavigationComponent},
  {path: 'home', component: IntropageComponent},
  {path: 'about', component: AboutpageComponent},
  {path: 'login', component: LoginpageComponent},
  {path: 'FPassword', component: ForgetPasswordComponent},
  {path: 'empDashboard/:uname', component: DashboardComponent},
  {path: 'credit', component: CreditComponent},
  {path: 'employees', component: EmployeesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
