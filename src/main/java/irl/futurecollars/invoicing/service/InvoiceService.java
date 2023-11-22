package irl.futurecollars.invoicing.service;

import irl.futurecollars.invoicing.db.Database;
import irl.futurecollars.invoicing.model.Invoice;
import java.util.List;
import java.util.Optional;

public class InvoiceService {

  private final Database database;

  public InvoiceService(Database database) {
    this.database = database;
  }

  public int save(Invoice invoice) {
    return database.save(invoice);
  }

  public Optional<Invoice> getById(int id) {
    return database.getById(id);
  }

  public List<Invoice> getAll() {
    return database.getAll();
  }

  public void update(int id, Invoice updatedInvoice) {
    database.update(id, updatedInvoice);
  }

  public void delete(int id) {
    database.delete(id);
  }

}
