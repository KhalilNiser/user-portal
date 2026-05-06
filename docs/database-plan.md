# Database Plan (Phase 1)

## Purpose
Store incoming leads and permit requests from the website.

---

## Table: leads

- id (primary key)
- name
- email
- phone
- project_type
- message
- created_at

---

## Table: permit_requests (optional early)

- id (primary key)
- name
- email
- phone
- details
- created_at

---

## Notes

- No user accounts yet
- No authentication yet
- Database is used only for capturing business inquiries
