## Homepage Strategy (Hero Focus)

The homepage must immediately communicate:

1. What we do
2. Who we serve
3. Proof of work

### Audiences we speak to:
- Homeowners (remodeling, builds)
- Contractors / Developers (large-scale work)
- Permit-only clients

### Core message direction:
- High-end construction quality
- Proven results (before/after projects)
- Ability to handle full builds OR permits only

### Hero Section Idea:
- Multiple strong headlines (not just one)
- Visual focus on before/after transformations
- Clear call-to-action (Get a Quote / Request Permit / View Projects)


## Hero Messaging (Refined)

### Headline 1 (Homeowners)
Turn Your Property Into a High-Quality Finished Build

### Headline 2 (Contractors / Developers)
Construction You Can Trust on Every Scale

### Headline 3 (Permits)
Permits Pulled Fast. Done Right the First Time.

### Supporting Line
We handle everything from full construction projects to permit-only services — backed by real, verifiable before-and-after results.

### Call To Action Options
- Get a Quote
- Request a Permit
- View Projects


## Hero Layout Strategy

### Structure
- Full-width hero section
- Large background visual (before/after project)
- Text overlay centered or left-aligned

### Headline Behavior
- Rotate or cycle through the three headlines:
  - Homeowners
  - Contractors / Developers
  - Permits
- Each headline stays visible for a few seconds

### Visual Direction
- Use real project images (before/after)
- Emphasize transformation (not generic stock images)

### Call To Action Placement
- Primary button: Get a Quote
- Secondary buttons:
  - Request a Permit
  - View Projects

### Goal
- Immediately show credibility
- Immediately show capability
- Immediately guide the user to take action


## Homepage Sections (Full Structure)

### 1. Hero Section
- Rotating headlines
- Before/after visuals
- Call-to-action buttons

### 2. Services Overview
- Brief summary of:
  - Construction Services
  - Contractor / Developer Work
  - Permit Services
- Each with short description + link to full page

### 3. Before & After Projects
- Real project transformations
- Side-by-side or slider comparison
- Strong visual proof of quality

### 4. Why Choose Us
- Key trust points:
  - Experience
  - Reliability
  - Quality of work
  - Permit expertise
- Short, direct bullets (no fluff)

### 5. Permits Section (Highlight)
- Dedicated emphasis on permit services
- Explain value:
  - Saves time
  - Avoids mistakes
  - Handled professionally

### 6. Process / How It Works
- Step-by-step:
  1. Request a quote / permit
  2. Review & planning
  3. Execution
  4. Completion

### 7. Contact / Lead Capture
- Simple form:
  - Name
  - Phone / Email
  - Project type
  - Message
- Clear CTA: “Get Started”

### 8. Footer
- Company info
- Navigation links
- Contact details


## Backend & Database Integration (Phase 1)

### What Needs Backend Support First

#### 1. Contact / Lead Form
- Name
- Phone / Email
- Project type
- Message

→ This will be stored in the database as a **lead**

#### 2. Permit Request (optional early)
- Name
- Contact info
- Permit details
- Address (if needed)

→ Stored as a **permit request**

---

### Initial Database Tables (Phase 1)

#### leads
- id
- name
- email
- phone
- project_type
- message
- created_at

#### permit_requests (optional early)
- id
- name
- email
- phone
- details
- created_at

---

### Important Rule

- The website is public first
- No login required initially
- Database is used to **capture business leads**, not users

---

### Future (Phase 2)

- Admin dashboard
- User authentication
- Role-based access
- Project tracking
- Customer accounts
