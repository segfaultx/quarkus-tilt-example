import { Component, inject, Inject, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  example = ''
  goodbye = ''
  personSearchQuery = ''
  personText: any

  httpClient = inject(HttpClient)

  ngOnInit(): void {
    this.fetchExample()
  }

  fetchExample() {
    this.httpClient.get("/api/example", { responseType: 'text'})
      .subscribe(response => this.example = response)
  }

  fetchGoodbye() {
    this.httpClient.get("/api/goodbye", { responseType: 'text'})
      .subscribe(response => this.goodbye = response)
  }

  createRandomPerson() {
    this.httpClient.post<void>("/api/person", null).subscribe();
  }

  getPersonByName() {
    this.httpClient.get<string>(`/api/person?name=${this.personSearchQuery}`).subscribe(response => this.personText = response)
  }
}
