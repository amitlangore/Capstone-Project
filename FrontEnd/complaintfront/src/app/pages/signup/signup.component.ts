import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { CustomerService } from 'src/app/services/customer.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private customerService: CustomerService, private snack: MatSnackBar) { }

  public customer = {
    userName:'',
    password:'',
    firstName:'',
    lastName:'',
    pincode:'',
    phone:''
  };

  ngOnInit(): void {
  }

formSubmit()
{
 console.log(this.customer);
 if(this.customer.userName==''|| this.customer.userName== null)
 {
  // alert('User is Required !!');
  this.snack.open("Username is required !! ", '',{
    duration:3000,
  });
   return;
 }


// addCustomer : customerservice
this.customerService.addCustomer(this.customer).subscribe(
(data: any)=>{
  //Success
  console.log(data);
  //alert('Success');
  Swal.fire('Successfully done !!!', 'Customer is registered. Id is ' + data.id, 'success'); 
},
(error)=>{
  //error
  console.log(error);
  //alert('Something went wrong');
  this.snack.open('Something went wrong !!!','',{
    duration : 3000
  })
}
);

}

}
