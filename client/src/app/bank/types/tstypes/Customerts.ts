// CustomerTS.ts
export class CustomerTS {
  customerId?: string;
  name: string;
  email: string;
  username: string;
  password: string;
  role?: string;

  constructor(name: string, email: string, username: string, password: string, role: string, customerId?: string) {
    this.customerId = customerId;
    this.name = name;
    this.email = email;
    this.username = username;
    this.password = password;
    this.role = role;
  }

  displayInfo(): void {
    console.log(`Customer ID: ${this.customerId}`);
    console.log(`Name: ${this.name}`);
    console.log(`Email: ${this.email}`);
    console.log(`Username: ${this.username}`);
    console.log(`Password: ${this.password}`);
  }
}
