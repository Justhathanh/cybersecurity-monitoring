# Data Leak Monitoring – Workflow

## 1. Tổng quan workflow

```text
User/Admin
   ↓
Authentication & Authorization
   ↓
Configure Rules & Data Sources
   ↓
Start Scan Job
   ↓
Scan Engine
   ↓
Rule Engine
   ↓
Leak Detected?
   ├─ No  → Store Clean Result
   └─ Yes → Create Leak Event → Alert → Dashboard
```

---

## 2. Authentication & Authorization Workflow

```text
User → Login
     → Validate credentials
     → Generate JWT / Session
     → Role check (ADMIN / ANALYST)
     → Audit log
```

---

## 3. Sensitive Data Rule Configuration Workflow

```text
Admin
  ↓
Create / Update Rule
  ↓
Validate rule (regex / keyword)
  ↓
Versioning
  ↓
Save to database
  ↓
Audit log
```

**Rule examples:**

* CCCD / CMND
* Email
* Phone number
* API key / Token
* Internal keyword

---

## 4. Data Source Configuration Workflow

```text
Admin
  ↓
Create Data Source
  ↓
Select type (FILE / DB / LOG / API)
  ↓
Store connection info (encrypted)
  ↓
Test connection
  ↓
Save
```

---

## 5. Scan Job Workflow (Core)

```text
User/Admin
  ↓
Create Scan Job
  ↓
Permission validation
  ↓
Queue job
  ↓
ScanJobExecutor starts
  ↓
Load rules
  ↓
Fetch data chunk
  ↓
Send to Rule Engine
  ↓
Repeat until completed
```

**Scan job states:**

```
CREATED → RUNNING → COMPLETED
             ↓
           FAILED
```

---

## 6. Rule Engine Workflow

```text
Input data
   ↓
Normalize data
   ↓
Regex matching
   ↓
Keyword matching
   ↓
Context validation
   ↓
Confidence scoring
```

**Output:**

* Matched content (masked)
* Rule ID
* Confidence score

---

## 7. Leak Detection Workflow

```text
Rule match found
    ↓
Create LeakEvent
    ↓
Attach evidence (masked)
    ↓
Classify severity
    ↓
Persist to database
```

**Severity levels:**

* LOW
* MEDIUM
* HIGH
* CRITICAL

---

## 8. Alert Workflow

```text
LeakEvent created
    ↓
Check severity threshold
    ↓
Trigger AlertService
    ↓
Send Email / Webhook
    ↓
Store Alert log
```

---

## 9. Dashboard Workflow

```text
User opens dashboard
    ↓
Fetch summary data
    ↓
List leak events
    ↓
View leak details
    ↓
Acknowledge / Resolve leak
```

---

## 10. Incident Response Workflow (Optional)

```text
Security Analyst
   ↓
Review leak event
   ↓
Update status
   ↓
Add investigation note
   ↓
Export report
```

**Leak event states:**

```
OPEN → ACKNOWLEDGED → RESOLVED
```

---

## 11. Workflow mapping to backend components

```text
ScanController
   ↓
ScanService
   ↓
ScanJobExecutor
   ↓
SensitiveDataScanner
   ↓
RuleMatcher
   ↓
LeakDetectionService
   ↓
AlertService
```

---

## 12. Demo workflow (Presentation flow)

1. Create sensitive data rule (e.g. CCCD)
2. Configure data source
3. Start scan job
4. Detect data leak
5. Alert triggered
6. Leak appears on dashboard
7. Analyst reviews and resolves

---

**Document purpose:**
This workflow describes the end-to-end process of detecting, handling, and responding to data leakage incidents in the Data Leak Monitoring system.
