from setuptools import setup, find_packages
from os import path

this_directory = path.abspath(path.dirname(__file__))
with open(path.join(this_directory, 'backend.md'), encoding='utf-8') as f:
    long_description = f.read()

setup(
    name="machine-fault-diagnosis",
    version="1.0.0",
    license='MIT',
    author="Zhuofu Song",
    author_email="zhuofusong@gmail.com",
    keywords="fault diagnosis",
    description="backend of a fault diagnosis app",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="",
    packages=find_packages(),

    scripts=["servers/server.py"],
    install_requires=[
        "numpy",
        "Flask",
        "Flask-Cors",
        "flasgger",
        "pybrake",
        "pytest==5.4.1",
        "codecov",
        "python-coveralls",
        "pytest-cov",
        ],

    package_data={
        # If any package contains *.txt or *.rst files, include them:
        "": ["*.txt", "*.rst", "*.md", "*.csv"],
        # And include any *.msg files found in the "hello" package, too:
        "components": ["*.msg"]
    },
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.8',
    project_urls={
        "Bug Tracker": "https://bugs.example.com/HelloWorld/",
        "Documentation": "https://docs.example.com/HelloWorld/",
        "Source Code": "https://code.example.com/HelloWorld/",
    }
)