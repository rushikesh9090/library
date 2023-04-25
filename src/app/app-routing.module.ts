import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';
import { ViewComponent } from './view/view.component';
import { NavigationComponent } from './navigation/navigation.component';
import { Insert1Component } from './insert1/insert1.component';
import { NavComponent } from './nav/nav.component';

const routes: Routes = [
  
  { path:'', redirectTo:'home', pathMatch: 'full'},
  {path:'home', component:HomeComponent},
  {path:'insert1', component:Insert1Component},
  {path:'update', component:UpdateComponent},
  {path:'delete', component:DeleteComponent},
  {path:'view', component:ViewComponent},
  {path:'navigation', component:NavigationComponent},
  {path:'nav',component:NavComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
