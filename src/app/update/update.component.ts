import { Component } from '@angular/core';
import { LibService } from '../lib.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {

  constructor(private s1:LibService){}
  updatedata(updateform:{value:any})
  {
    return this.s1.updateservice(updateform.value).subscribe();
    
  }

  }


