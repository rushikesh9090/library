import { Component } from '@angular/core';
import { LibService } from '../lib.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent {

constructor(private s1:LibService){}

  deletedata(deleteform:{value:any;}){
    return this.s1.deleteservice(deleteform.value).subscribe();
  }

}
