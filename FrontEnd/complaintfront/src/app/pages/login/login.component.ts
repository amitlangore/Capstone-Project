import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { CustomerService } from 'src/app/services/customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:any;
  password:any;

  
  constructor(private customerService: CustomerService , private router : Router) {


   }

  ngOnInit(): void {
  }
  login()
  {
     debugger;
    this.customerService.login(this.username,this.password).subscribe((isLogin: boolean) => {
      console.log('isLogin: ', isLogin);
      if(isLogin){
        this.router.navigate(['/admin']);
           }
    
    });
      
  }


}
