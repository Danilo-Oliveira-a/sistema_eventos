import { TestBed } from '@angular/core/testing';

import { EventoPresencialService } from './evento-presencial.service';

describe('EventoPresencialService', () => {
  let service: EventoPresencialService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EventoPresencialService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
