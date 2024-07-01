# Définir les variables
JAVAC = javac
JAVA = java
SRC_DIRS = jour01 jour02 jour03 jour04 jour05 jour06
OUT_DIR = out

# Trouver tous les fichiers Java dans les sous-répertoires
SRC_FILES = $(wildcard $(foreach dir, $(SRC_DIRS), $(dir)/*/*.java))

# Règle par défaut
all: compile

# Compilation
compile:
	@mkdir -p $(OUT_DIR)
	$(JAVAC) -d $(OUT_DIR) $(SRC_FILES)

# Exécution des programmes pour jour01
run1-job01:
	$(JAVA) -cp $(OUT_DIR) jour01.job01.HelloWorld

run1-job02:
	$(JAVA) -cp $(OUT_DIR) jour01.job02.HelloWorld

run1-job03:
	$(JAVA) -cp $(OUT_DIR) jour01.job03.HelloWorld

run1-job04:
	$(JAVA) -cp $(OUT_DIR) jour01.job04.DeclarationVariable

run1-job05:
	$(JAVA) -cp $(OUT_DIR) jour01.job05.Calcul

run1-job06:
	$(JAVA) -cp $(OUT_DIR) jour01.job06.ExerciceVariable

run1-job07:
	$(JAVA) -cp $(OUT_DIR) jour01.job07.Addition

run1-job08:
	$(JAVA) -cp $(OUT_DIR) jour01.job08.Facture

run1-job09:
	$(JAVA) -cp $(OUT_DIR) jour01.job09.MyString

run1-job10:
	$(JAVA) -cp $(OUT_DIR) jour01.job10.UserName

run1-job11:
	$(JAVA) -cp $(OUT_DIR) jour01.job11.ConvertHour

run1-job12:
	$(JAVA) -cp $(OUT_DIR) jour01.job12.ChangeString

run1-job13:
	$(JAVA) -cp $(OUT_DIR) jour01.job13.ListNumber

run1-job14:
	$(JAVA) -cp $(OUT_DIR) jour01.job14.Somme


# Exécution des programmes pour jour02
run2-job01:
	$(JAVA) -cp $(OUT_DIR) jour02.job01.Loop

run2-job02:
	$(JAVA) -cp $(OUT_DIR) jour02.job02.InverseLoop

run2-job03:
	$(JAVA) -cp $(OUT_DIR) jour02.job03.TimesTable

run2-job04:
	$(JAVA) -cp $(OUT_DIR) jour02.job04.ChiffresPairs

run2-job05:
	$(JAVA) -cp $(OUT_DIR) jour02.job05.LegalAge

run2-job06:
	$(JAVA) -cp $(OUT_DIR) jour02.job06.CalculPair

run2-job07:
	$(JAVA) -cp $(OUT_DIR) jour02.job07.Factorielle

run2-job08:
	$(JAVA) -cp $(OUT_DIR) jour02.job08.CompteChiffre

run2-job09:
	$(JAVA) -cp $(OUT_DIR) jour02.job09.ReceiveFirstLastNum

run2-job10:
	$(JAVA) -cp $(OUT_DIR) jour02.job10.AddNumber

run2-job11:
	$(JAVA) -cp $(OUT_DIR) jour02.job11.BuildTriangle

run2-job12:
	$(JAVA) -cp $(OUT_DIR) jour02.job12.TouteCombinaison


# Exécution des programmes pour jour03
run3-job01:
	$(JAVA) -cp $(OUT_DIR) jour03.job01.TableauStatic

run3-job02:
	$(JAVA) -cp $(OUT_DIR) jour03.job02.MonTableau

run3-job03:
	$(JAVA) -cp $(OUT_DIR) jour03.job03.TableauString

run3-job04:
	$(JAVA) -cp $(OUT_DIR) jour03.job04.TableauOccurence

run3-job05:
	$(JAVA) -cp $(OUT_DIR) jour03.job05.ValeurUnique

run3-job06:
	$(JAVA) -cp $(OUT_DIR) jour03.job06.NombresAleatoire

run3-job07:
	$(JAVA) -cp $(OUT_DIR) jour03.job07.Matrice

run3-job08:
	$(JAVA) -cp $(OUT_DIR) jour03.job08.TriMatrice

# Exécution des programmes pour jour04
run4-job01:
	$(JAVA) -cp $(OUT_DIR) jour04.job01.ThreadProject

run4-job02:
	$(JAVA) -cp $(OUT_DIR) jour04.job02.ThreadProject

run4-job03:
	$(JAVA) -cp $(OUT_DIR) jour04.job03.ThreadProject

run4-job04:
	$(JAVA) -cp $(OUT_DIR) jour04.job04.ThreadProject

run4-job05:
	$(JAVA) -cp $(OUT_DIR) jour04.job05.ThreadProject

run4-job06:
	$(JAVA) -cp $(OUT_DIR) jour04.job06.ThreadProject

run4-job07:
	$(JAVA) -cp $(OUT_DIR) jour04.job07.ThreadProject

run4-job08:
	$(JAVA) -cp $(OUT_DIR) jour04.job08.ThreadProject

# Exécution des programmes pour jour05
run5-job02:
	$(JAVA) -cp $(OUT_DIR) jour05.job02.SimpleWindow

run5-job03:
	$(JAVA) -cp $(OUT_DIR) jour05.job03.UserInputButton

run5-job04:
	$(JAVA) -cp $(OUT_DIR) jour05.job04.PersonalizeWindow

run5-job05:
	$(JAVA) -cp $(OUT_DIR) jour05.job05.SendText

run5-job06:
	$(JAVA) -cp $(OUT_DIR) jour05.job06.ListChoice

run5-job07:
	$(JAVA) -cp $(OUT_DIR) jour05.job07.ArrayData

run5-job08:
	$(JAVA) -cp $(OUT_DIR) jour05.job08.Panel

run5-job09:
	$(JAVA) -cp $(OUT_DIR) jour05.job09.DialBox

run6-job00:
	$(JAVA) -cp $(OUT_DIR) jour06.job00.Main

run6-job01:
	$(JAVA) -cp $(OUT_DIR) jour06.job01.AfficherSaisie

run6-job02:
	$(JAVA) -cp $(OUT_DIR) jour06.job02.EcrirePrenom

run6-job03:
	$(JAVA) -cp $(OUT_DIR) jour06.job03.Array

run6-job04:
	$(JAVA) -cp $(OUT_DIR) jour06.job04.Welcome

run6-job05:
	$(JAVA) -cp $(OUT_DIR) jour06.job05.Square

run6-job06:
	$(JAVA) -cp $(OUT_DIR) jour06.job06.MaxNumber

run6-job07:
	$(JAVA) -cp $(OUT_DIR) jour06.job07.Moyenne

run6-job08:
	$(JAVA) -cp $(OUT_DIR) jour06.job08.AddHundred

run6-job09:
	$(JAVA) -cp $(OUT_DIR) jour06.job09.AddCube

run6-job10:
	$(JAVA) -cp $(OUT_DIR) jour06.job10.Majority

run6-job11:
	$(JAVA) -cp $(OUT_DIR) jour06.job11.Factorielle

run6-job12:
	$(JAVA) -cp $(OUT_DIR) jour06.job12.FactorielleTwo

run6-job13:
	$(JAVA) -cp $(OUT_DIR) jour06.job13.NombrePair

run6-job14:
	$(JAVA) -cp $(OUT_DIR) jour06.job14.Times

run6-job15:
	$(JAVA) -cp $(OUT_DIR) jour06.job15.Inverse

# Nettoyage
clean:
	rm -rf $(OUT_DIR)

# Règle pour afficher l'aide
help:
	@echo "Utilisation :"
	@echo "  make          - Compile tous les fichiers Java"
	@echo "  make run1-jobXX - Exécute le programme du jobXX de jour01 (exemple: make run1-job01)"
	@echo "  make run2-jobXX - Exécute le programme du jobXX de jour02 (exemple: make run2-job01)"
	@echo "  make clean    - Supprime les fichiers compilés"
	@echo "  make help     - Affiche cette aide"

.PHONY: all compile clean help
