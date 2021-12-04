import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { WritecomplaintComponent } from './components/writecomplaint/writecomplaint.component';
import { DashboardComponent } from './pages/admin/dashboard/dashboard.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { SignupComponent } from './pages/signup/signup.component';

const routes: Routes = [
{
  path :'',
  component : HomeComponent,
  pathMatch :'full'

},

 {
   path:'signup',
   component: SignupComponent,
   pathMatch:'full',
 },
 {
  path:'contactus',
  component: ContactusComponent,
  pathMatch:'full',
},
{
  path:'aboutus',
  component: AboutusComponent,
  pathMatch:'full',
},
 {
   path : 'login',
   component : LoginComponent,
   pathMatch : 'full'
  },
 
  {
    path : 'admin',
    component : DashboardComponent,
    children:[
      {
        path : '',
        component: WelcomeComponent,
      },
      {
        path : 'profile',
        component: ProfileComponent,
      },
      {
        path:'writecomplaint',
        component : WritecomplaintComponent,
       },
      
    ],
   },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
