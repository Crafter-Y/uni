# Lab 01 Exercise: Foundations of IT Security

1.1 Security Fields:

1. An attacker intercepts communication between a customer and an online shop.

Cybersecurity

2. An employee loses a company laptop containing confidential project files.

Information Security

3. Confidential salary documents are stored in a locked filing cabinet.

Information Security

4. Malware attempts to access files stored on a workstation

IT Security

5. Two managers discuss confidential merger plans in a public café

Information Security

6. An attacker attempts to exploit an Internet-facing company web server.

Cybersecurity

> Each Cybersecurity problem has a Computer on at least one of the ends. Malware that is transmitted over the internet may use security holes there to then exploit local systems.

---

1.2 Security Goals:

1. A fitness application shares detailed user information with third parties beyond the purpose for which the information was collected.

Privacy

2. A DDoS attack makes an online shop unreachable.

Availability

3. An employee receives an email that appears to come from the CEO, but was actually sent by an attacker.

Authenticity

4. A digitally signed contract is disputed by one of the parties, who claims never to have approved it.

Non-redupitation

5. An attacker obtains a database containing customer passwords.

Confidentiality

6. After an administrator deletes an important database, the company cannot determine which administrator account performed the action.

Accountability

7. Malware changes the bank account number on an invoice.

Integrity

---

1.3 Security Terminology:

- Asset: Customer Information
- Weakness/Flaw: Unpatched/Outdated software
- Vulnerability: The security flaw
- Threat: The attacker 
- Exploit: What the attacker does
- Attack: Execution of the exploit
- Impact: Customer data leacked
- Risk: Potential data leakage, legal

> A vulnerability is a weakness that can be exploited
>
> An exploit is a method or code used to attack a system
>
> A treat represents something that has the potential to successfully exploit
>
> Risk considers both impact and likelyness

---

1.4 Authentication and Authorization:

Identification: A system stores information, roles and identifiers about a user

Authentification: the login process with credentials

Authorization: the attached access to subsystems to users. Not everybody can to everything

Access Right: A specifiy entry that controls access to a certain (sub-) system

> Alice authenticated, but has no the authorization to modify her grades, because she doesnt have the access (modification) rights to that system attached to her identification.

---

1.5 Apply Security Principles

1. Every employee has local administrator privileges.

Either introduce acess control, so no regular employee has access to administrator actions or implement a least privilege system, so employees only have the permissions they need

2. A critical server has not received security updates for two years.

Patch Management should be implemented to keep servers up to date.

3. Employees use only passwords to access sensitive company systems.

User Education should be put in place, Access Control systems should enforce 2FA to provide strong authentication for employees.

4. Guest Wi-Fi can directly communicate with internal company servers.

Network Segmentation is needed to seperate those networks.

5. One employee can create and approve a payment of EUR 500,000.

With the least priviledge principle, employees approval limits should be reasonable. 

6. The company has backups, but nobody has tested whether they can actually be restored.

Data Backup and Recovery should be properly set up and tested. 

7. A third-party maintenance company has permanent administrator access to production servers.

That falls into Vendor Risk Management if that theird party is considered a vendor, or else this is a access control problem

---

1.6 Defense in Depth:

1. No, just because the email was delivered, that does not mean the company got hacked. Most users probably wont even notice an email

2. 

- (a): User Education (Security Training)
- (b): Continuous Improvement (Block and delete after they got reported)
- (c): Access Control/Least Privilege (A single compromised user should not be able to do much harm)
- (d): Network monitoring (Monitor for suspicious activity in the network)

3. 

If you send a phishing mail to a company and ~1% of employees click on it, there is a security breach. At a certain size, it is almost gurenteed that someone will click a malicious link in an email.

---

1.7 Incident Analysis:

7.1

1. The employee wasn't properly trained and clicked on a malicous link
2. The users account wasnt properly secured
3. The network wasnt properly segregated
4. The employee had probably too much access, not following least privilege concepts
5. Security alerts werent configured properly
6. The backup system wasnt redundant/segregated enough

7.2

- Confidentiality: Internal systems are always confidential
- Integrity: Data was protentially modified
- Availability: Possibly affected due to encrypted data
- Authenticity: Administrative access to systems usually bypass authenticity checks
- Accountability: Probably intact if logging is properly in place

7.3

Everything from 7.1

---

1.8 Incident Response

1. Identify which systems are affected
2. Isolate affected systems from the network.
3. Determine how the attacker initially gained access.
4. Remove malware and compromised accounts.
5. Restore systems from verified clean backups.
6. Improve security controls based on lessons learned.

> The malware may come back immediately if it wasnt removed properly

---

1.9 Design a Secure Company

I'd implement the security principles from 1.5:

- Least Privilege / Need-to-Know
- Separation of Duty
- Defense in Depth
- Patch Management
- Access Control
- Strong Authentication
- Encryption
- Auditing and Monitoring
- Incident Response
- User Education
- Vendor Risk Management
- Data Backup and Recovery
- Secure Development
- Network Segmentation
- Continuous Improvement

---

1.10 Security is a Process

Security might be improved but no system can ever be fully secured. The biggest security risk is people. If new people get hired, they need to be trained to maintain that security. If processes or technology changes, new security measures might beed to be adapted. If new threats or vulnerabilities arise, systems will need to be patched to be secure again.

I think it is generally questionably if a firewall+antivirus+backup system is enough to call a company secure. These measures alone dont fulfull every principle from 1.9.

