import { Component } from '@angular/core';
import { LibService } from '../lib.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-insert1',
  templateUrl: './insert1.component.html',
  styleUrls: ['./insert1.component.css']
})
export class Insert1Component {

constructor(private s:LibService){}
insertdata(insert1form:{value:any;})
{
  return this.s.insertservice(insert1form.value).subscribe();
}
}
