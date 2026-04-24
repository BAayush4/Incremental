export class TransactionTS {
  transactionId?: number;
  accountId: string;
  amount: number;
  transactionDate: Date;
  transactionType: number;

  constructor(accountId: string, amount: number, transactionDate: Date, transactionType: number, transactionId?: number) {
    this.accountId = accountId;
    this.amount = amount;
    this.transactionDate = transactionDate;
    this.transactionType = transactionType;
    // ✅ Default to 1 if not provided
    this.transactionId = transactionId ?? 1;
  }

  displayInfo(): void {
    console.log(`Transaction ID: ${this.transactionId}`);
    console.log(`Account ID: ${this.accountId}`);
    console.log(`Amount: ${this.amount.toFixed(2)}`);
    console.log(`Transaction Date: ${this.transactionDate}`);
    console.log(`Transaction Type: ${this.transactionType}`);
  }
}
