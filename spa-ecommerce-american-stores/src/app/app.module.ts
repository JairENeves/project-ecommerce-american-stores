import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductListingComponent } from './product-listing/product-listing.component';
import { ProductService } from './product.service';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { LoginComponent } from './login/login.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatNativeDateModule} from '@angular/material/core';
import {MatCardModule} from '@angular/material/card';  
import { FormsModule } from '@angular/forms';
import {MatIconModule} from '@angular/material/icon';
import { ProductDetailsComponent } from './product-details/product-details.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductListingComponent,
    ProductDetailsComponent,
    LoginComponent
  ],
  imports: [
    AppRoutingModule, 
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatCardModule,
    MatIconModule,
    
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
