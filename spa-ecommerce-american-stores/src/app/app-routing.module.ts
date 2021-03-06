import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListingComponent } from './product-listing/product-listing.component';
import { ProductDetailsComponent } from './product-details/product-details.component';

const routes: Routes = [
  { path: 'productListing', component: ProductListingComponent },
  { path: 'productDetails/:id', component: ProductDetailsComponent },
  { path: '', redirectTo: '/productListing', pathMatch: 'full' },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
