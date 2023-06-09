"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import person as shared_person
from typing import Optional


@dataclasses.dataclass
class FindPersonRequest:
    
    email: str = dataclasses.field(metadata={'query_param': { 'field_name': 'email', 'style': 'form', 'explode': True }})
    r"""The email address to look up"""  
    company: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'company', 'style': 'form', 'explode': True }})
    r"""The name of the company the person works for"""  
    company_domain: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'company_domain', 'style': 'form', 'explode': True }})
    r"""The domain of the company the person works for"""  
    facebook: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'facebook', 'style': 'form', 'explode': True }})
    r"""The person's Facebook profile URL"""  
    family_name: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'family_name', 'style': 'form', 'explode': True }})
    r"""The person's last name. If you have this, passing this is strongly recommended to improve match rates"""  
    given_name: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'given_name', 'style': 'form', 'explode': True }})
    r"""The person's first name"""  
    ip_address: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'ip_address', 'style': 'form', 'explode': True }})
    r"""The person's IP address. If you have this, passing this is strongly recommended to improve match rates"""  
    linkedin: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'linkedin', 'style': 'form', 'explode': True }})
    r"""The person's LinkedIn profile URL"""  
    location: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'location', 'style': 'form', 'explode': True }})
    r"""The city or country where the person lives"""  
    twitter: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'twitter', 'style': 'form', 'explode': True }})
    r"""The person's Twitter profile username"""  
    webhook_url: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'webhook_url', 'style': 'form', 'explode': True }})
    r"""A webhook URL that results will be sent to"""  
    

@dataclasses.dataclass
class FindPersonResponse:
    
    content_type: str = dataclasses.field()  
    status_code: int = dataclasses.field()  
    person: Optional[shared_person.Person] = dataclasses.field(default=None)
    r"""Successful lookup, person encoded in the response body"""  
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)  
    