import { TestBed } from '@angular/core/testing';
// import {NavigationComponent} from 'src/app/AppServices/user-login.service'
import { UserLoginService } from './user-login.service';

describe('UserLoginService', () => {
  let service: UserLoginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserLoginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
