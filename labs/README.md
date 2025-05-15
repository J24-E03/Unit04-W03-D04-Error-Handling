## **Lab: Add Validation, Error Handling, and Many-to-Many Relationships to Your Book App**

---

### **Learning Objectives**

By the end of this lab, you should be able to:

* Add validation rules to model fields using annotations
* Handle validation errors in controllers and show them in forms
* Implement custom exceptions and global error handling using `@ControllerAdvice`
* Add a many-to-many relationship between `Book` and a new `Publisher` entity
* Use service classes to separate business logic from controllers

---

### **Part 1: Add Validation to Book and Author**

1. **Add Validation Annotations**

   * Update your `Book` and `Author` classes to include appropriate validation annotations such as `@NotBlank`, `@Size`, `@Min`, etc.

2. **Update Form Pages**

   * Modify your book and author form pages to show validation errors under each input field if they are present.

3. **Use BindingResult in Controllers**

   * Modify your controller POST methods to handle validation errors. If there are errors, return to the form and display the messages.

---

### **Part 2: Add Custom Exception Handling with Controller Advice**

1. **Create a Custom Exception**

   * Create a custom exception class that can be used when a book, author, or publisher is not found.

2. **Throw the Exception in Services**

   * Update your services to throw this exception if a requested entity cannot be found.

3. **Handle the Exception Globally**

   * Create a class annotated with `@ControllerAdvice` to catch this exception and return a user-friendly error page.
   * Create custom error templates (e.g., `404.html`, `general.html`) in your templates directory.

---

### **Part 3: Add Many-to-Many Relationship Between Book and Publisher**

1. **Create the Publisher Entity**

   * Add a new `Publisher` class as an entity with fields like `id` and `name`.

2. **Set Up Many-to-Many Relationship**

   * Connect `Book` and `Publisher` using a many-to-many relationship. Make sure to configure the owning side and join table correctly.

3. **Create Publisher Repository and Service**

   * Create a `PublisherRepository` interface and a `PublisherService` class to manage business logic.

4. **Add Publisher Form**

   * Create a form to add new publishers.

5. **Update Book Form**

   * Update the book creation/editing form to allow the user to select one or more publishers when creating or editing a book.

---

### **Part 4: Refactor Business Logic into Service Classes**

1. **Create Service Classes**

   * Create a service class for each entity: Book, Author, and Publisher.
   * Move logic such as saving, finding by ID, and listing all records from controllers into these service classes.

2. **Use Services in Controllers**

   * Inject and use the services in your controllers instead of calling the repository directly.

