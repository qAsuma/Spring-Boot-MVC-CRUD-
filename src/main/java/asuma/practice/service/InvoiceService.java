package asuma.practice.service;

import asuma.practice.entity.Invoice;

import java.util.List;

public interface InvoiceService {

      Invoice saveInvoice(Invoice invoice);
      List<Invoice> getAllInvoices();
      Invoice getInvoiceById(Long id);
      void deleteInvoiceById(Long id);
      void updateInvoice(Invoice invoice);

}
