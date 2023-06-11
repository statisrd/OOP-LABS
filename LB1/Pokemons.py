Pokemons = [["Rattata",1],["Arboliva",9],["Snomier",8],["Haunter",1],["Ivysaur",1],["Lopunny",4],["Slugma",2],["Swablu",3],["Aggron",3],["Crobat",2],["Escaval",5],["Diglett",1],]
print("\t","Pokemons","   \t","Gens")
f = open('text.txt', 'w')
for range in Pokemons:
    print("\t",range[0],"   \t",range[1],)
    f.write("\t"+str(range[0])+"  \t"+str(range[1])+"\n")

print("\n\n\tAfter sort:")
f.write("\n")
print("\t","Pokemons","   \t","Gens")
for range in sorted(Pokemons, key=lambda x:x[1]):
    print("\t",range[0],"   \t",range[1],)
    f.write("\t"+str(range[0])+"  \t"+str(range[1])+"\n")
f.close()
