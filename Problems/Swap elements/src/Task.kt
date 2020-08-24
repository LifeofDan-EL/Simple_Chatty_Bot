// The array numbers already exists. Write only exchange actions here.
numbers[0] = numbers[numbers.size - 1].also { numbers[numbers.size - 1] = numbers[0] }
