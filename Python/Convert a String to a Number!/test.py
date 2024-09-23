import unittest
from main import string_to_number

class Test_string_to_number(unittest.TestCase):
    def test_null_string_to_number(self):
        self.assertEqual(string_to_number("0"), 0)

    def test1_string_to_number(self):
        self.assertEqual(string_to_number("123"), 123)

    def test2_string_to_number(self):
        self.assertEqual(string_to_number("54324"), 54324)

    def test3_string_to_number(self):
        self.assertEqual(string_to_number("-289"), -289)

    def test4_string_to_number(self):
        self.assertEqual(string_to_number("1328732"), 1328732)

    def test5_string_to_number(self):
        self.assertEqual(string_to_number("1"), 1)

if __name__ == '__main__':
    unittest.main()