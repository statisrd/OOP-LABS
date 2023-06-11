import os
path_to_file = 'test.txt'
if os.path.exists(path_to_file):
   file = open(path_to_file)
   print(*file)
   file.close()
else:
    print(u'не удалось открыть файл')