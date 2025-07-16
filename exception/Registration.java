class Registration {
    public void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to register.");
        }
    }
}
