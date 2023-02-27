import { TestBed } from '@angular/core/testing';

import { EventoOlineService } from './evento-oline.service';

describe('EventoOlineService', () => {
  let service: EventoOlineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EventoOlineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
